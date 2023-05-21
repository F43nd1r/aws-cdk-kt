package com.faendir.awscdkkt.services.rds

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.rds.DatabaseSecretProps

@Generated
public fun databaseSecretProps(initializer: DatabaseSecretProps.Builder.() -> Unit = {}):
    DatabaseSecretProps = DatabaseSecretProps.builder().apply(initializer).build()
