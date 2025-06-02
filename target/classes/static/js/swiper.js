const swiper = new Swiper('.mySwiper', {
    slidesPerView: 1.6,
    centeredSlides: false,
    loop: true,
    spaceBetween: 20,
    grabCursor: true,
    pagination: {
        el: '.swiper-pagination',
        clickable: true
    },
    navigation: {
        nextEl: '.swiper-button-next',
        prevEl: '.swiper-button-prev',
    },
    breakpoints: {
        768: {
            slidesPerView: 2.2,
        },
        1024: {
            slidesPerView: 3,
        }
    }
});


