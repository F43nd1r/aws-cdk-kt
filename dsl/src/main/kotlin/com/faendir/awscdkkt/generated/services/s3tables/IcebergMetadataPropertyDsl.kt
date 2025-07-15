package com.faendir.awscdkkt.generated.services.s3tables

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.s3tables.CfnTable

@Generated
public fun buildIcebergMetadataProperty(initializer: @AwsCdkDsl
    CfnTable.IcebergMetadataProperty.Builder.() -> Unit = {}): CfnTable.IcebergMetadataProperty =
    CfnTable.IcebergMetadataProperty.Builder().apply(initializer).build()
