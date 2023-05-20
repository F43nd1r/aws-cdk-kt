@file:Generated(value = ["Generated 2023-05-20 based on CDK 2.79.1"])

package com.faendir.awscdkkt.services.waf

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.waf.CfnXssMatchSet

public
    fun xssMatchTupleProperty(initializer: CfnXssMatchSet.XssMatchTupleProperty.Builder.() -> Unit):
    CfnXssMatchSet.XssMatchTupleProperty =
    CfnXssMatchSet.XssMatchTupleProperty.builder().apply(initializer).build()
