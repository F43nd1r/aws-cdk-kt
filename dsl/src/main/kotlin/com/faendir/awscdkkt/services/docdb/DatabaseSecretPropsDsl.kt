package com.faendir.awscdkkt.services.docdb

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.docdb.DatabaseSecretProps

@Generated
public fun databaseSecretProps(initializer: DatabaseSecretProps.Builder.() -> Unit = {}):
    DatabaseSecretProps = DatabaseSecretProps.builder().apply(initializer).build()
