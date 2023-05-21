package com.faendir.awscdkkt.services.rds

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.rds.MariaDbInstanceEngineProps

@Generated
public fun mariaDbInstanceEngineProps(initializer: MariaDbInstanceEngineProps.Builder.() -> Unit =
    {}): MariaDbInstanceEngineProps =
    MariaDbInstanceEngineProps.builder().apply(initializer).build()
