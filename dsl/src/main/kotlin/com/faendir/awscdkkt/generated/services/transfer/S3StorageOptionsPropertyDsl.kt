package com.faendir.awscdkkt.generated.services.transfer

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.transfer.CfnServer

@Generated
public fun buildS3StorageOptionsProperty(initializer: @AwsCdkDsl
    CfnServer.S3StorageOptionsProperty.Builder.() -> Unit = {}): CfnServer.S3StorageOptionsProperty
    = CfnServer.S3StorageOptionsProperty.Builder().apply(initializer).build()
