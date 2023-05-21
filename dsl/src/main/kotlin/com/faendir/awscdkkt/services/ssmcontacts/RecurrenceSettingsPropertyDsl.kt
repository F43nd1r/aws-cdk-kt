package com.faendir.awscdkkt.services.ssmcontacts

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.ssmcontacts.CfnRotation

@Generated
public
    fun recurrenceSettingsProperty(initializer: CfnRotation.RecurrenceSettingsProperty.Builder.() -> Unit
    = {}): CfnRotation.RecurrenceSettingsProperty =
    CfnRotation.RecurrenceSettingsProperty.builder().apply(initializer).build()
