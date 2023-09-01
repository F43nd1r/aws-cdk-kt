package com.faendir.awscdkkt.generated.services.docdb

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.docdb.DatabaseSecretProps

@Generated
public fun buildDatabaseSecretProps(initializer: @AwsCdkDsl DatabaseSecretProps.Builder.() -> Unit =
    {}): DatabaseSecretProps = DatabaseSecretProps.Builder().apply(initializer).build()
