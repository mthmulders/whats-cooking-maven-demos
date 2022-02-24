module coffeeshop.impl {
    requires coffeeshop.api;

    provides coffeeshop.api.BeanGrinder
        with coffeeshop.impl.BeanGrinderImpl;
}
