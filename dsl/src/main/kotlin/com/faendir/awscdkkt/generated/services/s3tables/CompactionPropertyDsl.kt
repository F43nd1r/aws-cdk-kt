package com.faendir.awscdkkt.generated.services.s3tables

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.s3tables.CfnTable

@Generated
public fun buildCompactionProperty(initializer: @AwsCdkDsl
    CfnTable.CompactionProperty.Builder.() -> Unit = {}): CfnTable.CompactionProperty =
    CfnTable.CompactionProperty.Builder().apply(initializer).build()
