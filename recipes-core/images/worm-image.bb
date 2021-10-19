SUMMARY = "Image for cm4 io board"
HOMEPAGE = "gis1501@gmail.com"
LICENSE = "MIT"

require mini-image.bb

DEV_SDK_INSTALL = " \
    binutils \
    binutils-symlinks \
    coreutils \
    file \
    gettext \
    ldd \
    libstdc++ \
    libtool \
    perl-modules \
    pkgconfig \
"

OPENMP = " \
    libgomp \
"

MQTT = " \
    libmosquitto1 \
    libmosquittopp1 \
    mosquitto \
    mosquitto-clients \
"

FONTS = " \
    fontconfig \
    fontconfig-utils \
    ttf-bitstream-vera \
"

TSLIB = " \
    tslib \
    tslib-conf \
    tslib-calibrate \
    tslib-tests \
"

VIRTUAL = " \
    docker-ce \
    docker-compose \
"

IMAGE_INSTALL += " \
    ${DEV_SDK_INSTALL} \
    ${OPENMP} \
    ${MQTT} \
    ${FONTS} \
    ${TSLIB} \
"

export IMAGE_BASENAME = "worm-image"
