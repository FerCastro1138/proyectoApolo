import React, { useState } from 'react'
import AppBar from '@mui/material/AppBar';
import Box from '@mui/material/Box';
import Toolbar from '@mui/material/Toolbar';
import IconButton from '@mui/material/IconButton';
import Typography from '@mui/material/Typography';
import Menu from '@mui/material/Menu';
import Container from '@mui/material/Container';
import Avatar from '@mui/material/Avatar';
import Button from '@mui/material/Button';
import Tooltip from '@mui/material/Tooltip';
import MenuItem from '@mui/material/MenuItem';
import { Diversity1Rounded } from '@mui/icons-material';


const pages = ['Blog', 'About us', 'Services'];
const settings = ['Profile', 'Account', 'Dashboard', 'Logout'];

export const AppBarComponent = () => {

    const [anchorElUser, setAnchorElUser] = useState(null);

    const handleOpenUserMenu = (event) => {
        setAnchorElUser(event.currentTarget);
    };
    
    const handleCloseUserMenu = () => {
        setAnchorElUser(null);
    };

    return (
    <>
    <AppBar position='fixed'>
        <Container maxWidth="xl">
        <Toolbar disableGutters>
            <Diversity1Rounded sx={{ 
                display: { xs: 'flex', md: 'flex' }, mr: 1,
                fontSize: { xs: '2rem', md: '3rem' }
            }}/>
            <Typography
                noWrap
                sx={{ 
                mr: 10,
                textDecoration: 'none', 
                color: 'white', 
                fontWeight: '500',
                textDecorationColor: 'ActiveCaption',
                pointerEvents: 'none',
                letterSpacing: '.2rem',
                fontFamily: 'MuseoModerno',
                display: { xs: 'none', md: 'flex' }
                }}
            >
                Atención al Alumno
            </Typography>
            <Box sx={{ flexGrow: 1, display: {xs: 'flex', md: 'flex'} }}>
                {pages.map((page) => (
                <Button key={page}
                    onClick={handleCloseUserMenu}
                    sx={{ my: 2, color: 'white', display: 'block' }}
                >
                    {page}
                </Button>
                ))}
            </Box>
            <Box sx={{ flexGrow: 0 }}>
                <Tooltip title="Open settings">
                <IconButton onClick={handleOpenUserMenu} sx={{ p:0 }}>
                    <Avatar alt="Remy Sharp" src='/static/images/avatar/2.jpg'/>
                </IconButton>
                </Tooltip>
                <Menu
                sx={{ mt: '2.5rem' }}
                id="menu-appbar"
                anchorEl={anchorElUser}
                anchorOrigin={{
                    vertical: 'top',
                    horizontal: 'right'
                }}
                keepMounted
                transformOrigin={{
                    vertical: 'top',
                    horizontal: 'right'
                }}
                open={Boolean(anchorElUser)}
                onClose={handleCloseUserMenu}
                >
                {settings.map((setting) => (
                    <MenuItem key={setting} onClick={handleCloseUserMenu}>
                    <Typography sx={{ textAlign: 'center'}}>{setting}</Typography>
                    </MenuItem>
                ))}
                </Menu>
            </Box>
        </Toolbar>
        </Container>
    </AppBar>
    </>
)
}
