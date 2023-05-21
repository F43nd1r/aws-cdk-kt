package com.faendir.awscdkkt.services.dms

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.dms.CfnEndpoint

@Generated
public fun s3SettingsProperty(initializer: CfnEndpoint.S3SettingsProperty.Builder.() -> Unit = {}):
    CfnEndpoint.S3SettingsProperty =
    CfnEndpoint.S3SettingsProperty.builder().apply(initializer).build()
