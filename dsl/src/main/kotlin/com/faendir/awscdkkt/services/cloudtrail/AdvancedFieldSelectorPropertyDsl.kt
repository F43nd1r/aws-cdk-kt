package com.faendir.awscdkkt.services.cloudtrail

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.cloudtrail.CfnEventDataStore

@Generated
public
    fun advancedFieldSelectorProperty(initializer: CfnEventDataStore.AdvancedFieldSelectorProperty.Builder.() -> Unit
    = {}): CfnEventDataStore.AdvancedFieldSelectorProperty =
    CfnEventDataStore.AdvancedFieldSelectorProperty.builder().apply(initializer).build()
