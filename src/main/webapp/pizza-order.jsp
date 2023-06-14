<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<html>
<head>
    <%@ include file="partials/head.jsp" %>
    <title>Pizza Order</title>
</head>
<body>
<%@ include file="partials/navbar.jsp" %>
<div class="container w-50">
    <form class="d-flex flex-column" action="/pizza-order" method="POST">
        <label for="pizza-crust">Pizza Crust:</label>
        <select class="form-select" id="pizza-crust" name="pizza-crust">
            <option selected></option>
            <option value="Thin">Thin</option>
            <option value="Hand Tossed">Hand Tossed</option>
            <option value="Deep Dish">Deep Dish</option>
        </select>

        <br>

        <label for="pizza-sauce">Pizza Sauce:</label>
        <select class="form-select" id="pizza-sauce" name="pizza-sauce">
            <option selected></option>
            <option value="Marinara">Marinara</option>
            <option value="BBQ">BBQ</option>
            <option value="Alfredo">Alfredo</option>
        </select>

        <br>

        <label for="pizza-size">Pizza Size:</label>
        <select class="form-select" id="pizza-size" name="pizza-size">
            <option selected></option>
            <option value="Small">Small</option>
            <option value="Medium">Medium</option>
            <option value="Large">Large</option>
        </select>

        <br>

        <input class="form-check-input" type="checkbox" value="Beef" id="beef" name="toppings">
        <label class="form-check-label" for="beef">
            Beef
        </label>

        <input class="form-check-input" type="checkbox" value="Bacon" id="bacon" name="toppings">
        <label class="form-check-label" for="bacon">
            Bacon
        </label>

        <input class="form-check-input" type="checkbox" value="Pepperoni" id="pepperoni" name="toppings">
        <label class="form-check-label" for="pepperoni">
            Pepperoni
        </label>

        <input class="form-check-input" type="checkbox" value="Green Peppers" id="green-peppers" name="toppings">
        <label class="form-check-label" for="green-peppers">
            Green Peppers
        </label>

        <input class="form-check-input" type="checkbox" value="Onions" id="onions" name="toppings">
        <label class="form-check-label" for="onions">
            Onions
        </label>

        <input class="form-check-input" type="checkbox" value="Pineapple" id="pineapple" name="toppings">
        <label class="form-check-label" for="pineapple">
            Pineapple
        </label>

        <div class="mb-3">
            <label for="delivery-address" class="form-label">Delivery Address</label>
            <input type="text" class="form-control" id="delivery-address" name="delivery-address">
        </div>

        <br>

        <button type="submit" class="btn btn-primary">Submit</button>

    </form>

</div>

<%@include file="partials/scripts.jsp" %>
</body>
</html>
