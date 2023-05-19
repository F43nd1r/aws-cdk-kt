@file:Generated(value = ["Generated 2023-05-19 based on CDK 2.79.1"])

package com.faendir.awscdkkt.services.ssmcontacts

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.ssmcontacts.CfnRotation

public
    fun recurrenceSettingsProperty(initializer: CfnRotation.RecurrenceSettingsProperty.Builder.() -> Unit):
    CfnRotation.RecurrenceSettingsProperty =
    CfnRotation.RecurrenceSettingsProperty.builder().apply(initializer).build()
