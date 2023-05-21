package com.faendir.awscdkkt.alexa.ask

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.alexa.ask.CfnSkill

@Generated
public
    fun authenticationConfigurationProperty(initializer: CfnSkill.AuthenticationConfigurationProperty.Builder.() -> Unit
    = {}): CfnSkill.AuthenticationConfigurationProperty =
    CfnSkill.AuthenticationConfigurationProperty.builder().apply(initializer).build()
