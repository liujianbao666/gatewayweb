/*
 * Copyright (c) 2012-2018 The original author or authors
 * ------------------------------------------------------
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * and Apache License v2.0 which accompanies this distribution.
 *
 * The Eclipse Public License is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * The Apache License v2.0 is available at
 * http://www.opensource.org/licenses/apache2.0.php
 *
 * You may elect to redistribute this code under either of these licenses.
 */

package com.kd.spi;

public interface IStore {

    void initStore();

    void close();

    /**
     * Factory method to instantiate the messages store.
     *
     * @return the create instance of IMessagesStore.
     * */
    IMessagesStore messagesStore();

    /**
     * Factory method to instantiate the session store.
     *
     * @return the create instance of ISessionsStore.
     * */
    ISessionsStore sessionsStore();
}
