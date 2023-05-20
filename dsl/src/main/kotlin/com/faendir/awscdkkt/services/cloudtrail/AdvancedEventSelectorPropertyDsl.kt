@file:Generated(value = ["Generated 2023-05-20 based on CDK 2.79.1"])

package com.faendir.awscdkkt.services.cloudtrail

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.cloudtrail.CfnEventDataStore

public
    fun advancedEventSelectorProperty(initializer: CfnEventDataStore.AdvancedEventSelectorProperty.Builder.() -> Unit):
    CfnEventDataStore.AdvancedEventSelectorProperty =
    CfnEventDataStore.AdvancedEventSelectorProperty.builder().apply(initializer).build()
