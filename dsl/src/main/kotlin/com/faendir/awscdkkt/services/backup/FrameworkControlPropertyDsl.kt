package com.faendir.awscdkkt.services.backup

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.backup.CfnFramework

@Generated
public
    fun frameworkControlProperty(initializer: CfnFramework.FrameworkControlProperty.Builder.() -> Unit
    = {}): CfnFramework.FrameworkControlProperty =
    CfnFramework.FrameworkControlProperty.builder().apply(initializer).build()
