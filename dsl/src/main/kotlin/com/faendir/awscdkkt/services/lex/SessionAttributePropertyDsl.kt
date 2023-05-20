@file:Generated(value = ["Generated based on CDK v2.79.1"])

package com.faendir.awscdkkt.services.lex

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.lex.CfnBot

public
    fun sessionAttributeProperty(initializer: CfnBot.SessionAttributeProperty.Builder.() -> Unit):
    CfnBot.SessionAttributeProperty =
    CfnBot.SessionAttributeProperty.builder().apply(initializer).build()
