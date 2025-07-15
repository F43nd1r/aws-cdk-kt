package com.faendir.awscdkkt.generated.services.s3tables

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.s3tables.CfnTable

@Generated
public fun buildIcebergSchemaProperty(initializer: @AwsCdkDsl
    CfnTable.IcebergSchemaProperty.Builder.() -> Unit = {}): CfnTable.IcebergSchemaProperty =
    CfnTable.IcebergSchemaProperty.Builder().apply(initializer).build()
