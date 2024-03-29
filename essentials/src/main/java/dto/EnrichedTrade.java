/*
 * Copyright (c) 2008-2019, Hazelcast, Inc. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package dto;

/**
 * Enriched version of {@link Trade} which includes the trader name
 */
public class EnrichedTrade extends Trade {

    private final String trader;

    public EnrichedTrade(Trade trade, String trader) {
        super(trade.getTime(),trade.getTicker(),trade.getQuantity(), trade.getPrice());
        this.trader = trader;
    }

    public String getTrader() {
        return trader;
    }

    @Override
    public String toString() {
        return "Trade{time=" + getTime() + ", trader='" + getTrader() + '\'' + ", quantity=" + getQuantity()
                + ", price=" + getPrice() + '}';
    }
}