package com.faendir.awscdkkt.services.sam

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.sam.CfnFunction

@Generated
public
    fun alexaSkillEventProperty(initializer: CfnFunction.AlexaSkillEventProperty.Builder.() -> Unit
    = {}): CfnFunction.AlexaSkillEventProperty =
    CfnFunction.AlexaSkillEventProperty.builder().apply(initializer).build()
