package com.faendir.awscdkkt.services.cloudtrail

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.cloudtrail.CfnEventDataStore

@Generated
public
    fun advancedEventSelectorProperty(initializer: CfnEventDataStore.AdvancedEventSelectorProperty.Builder.() -> Unit
    = {}): CfnEventDataStore.AdvancedEventSelectorProperty =
    CfnEventDataStore.AdvancedEventSelectorProperty.builder().apply(initializer).build()
