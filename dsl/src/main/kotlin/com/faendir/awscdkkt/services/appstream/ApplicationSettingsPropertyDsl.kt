package com.faendir.awscdkkt.services.appstream

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.appstream.CfnStack

@Generated
public
    fun applicationSettingsProperty(initializer: CfnStack.ApplicationSettingsProperty.Builder.() -> Unit
    = {}): CfnStack.ApplicationSettingsProperty =
    CfnStack.ApplicationSettingsProperty.builder().apply(initializer).build()
