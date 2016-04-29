package com.layered.stocks;

import com.layered.stocks.model.Stock;

import java.math.BigDecimal;
import java.util.List;
import java.util.Optional;
import java.util.Set;

public class StockManager {

    /**
     * Get the list of stocks currently under management by its ticker symbol.
     */
    public List<Stock> findByTicker(final String ticker) {
        // TODO: Implement me.
        return null;
    }

    /**
     * For a given ticker symbol, add up the total stock values under management and return.
     */
    public BigDecimal getValueUnderManagerByTicker(final String ticker) {
        // TODO: Implement me.
        return null;
    }

    /**
     * For a given ticker symbol, get the number of stocks under management.
     */
    public int numberOfStocksByTicker(final String ticker) {
        // TODO: Implement me.
        return -1;
    }

    /**
     * Add a new stock to be managed by our system (here 'buy' is equal to 'add').
     *
     * @param stock          - The {@link com.layered.stocks.model.Stock} to buy
     * @param numberOfShares - The number of shares to purchase
     * @throws java.lang.IllegalArgumentException if numberOfShares is <= 0
     */
    public void buyStock(final Stock stock, final int numberOfShares) {
        // TODO: Implement me.
    }

    /**
     * For a given ticker, sell the stock. The stock sold should be returned before being removed from management.
     * <p>
     * This method will attempt to sell stock starting with the lowest price.
     *
     * @param ticker         - The stock ticker to sell
     * @param numberOfShares - The number of shares to purchase
     * @param sharePrice     - The price we are selling numberOfShares
     * @return A list of the stock prices that were sold sorted from most to least expensive
     * @throws java.lang.IllegalArgumentException if numberOfShares is <= 0
     */
    public Optional<Set<BigDecimal>> sellStock(final String ticker, final int numberOfShares, final BigDecimal sharePrice) {
        // TODO: Implement me.
        return null;
    }

    /**
     * For a given stock ticker, get the P&L.
     *
     * @return The total profit made so far or an empty option if the stock is not under management
     */
    public Optional<BigDecimal> getProfitForStockByTicker(final String ticker) {
        // TODO: Implement me.
        return null;
    }
}
