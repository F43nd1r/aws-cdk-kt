package com.faendir.awscdkkt.services.waf

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.waf.CfnXssMatchSet

@Generated
public
    fun xssMatchTupleProperty(initializer: CfnXssMatchSet.XssMatchTupleProperty.Builder.() -> Unit =
    {}): CfnXssMatchSet.XssMatchTupleProperty =
    CfnXssMatchSet.XssMatchTupleProperty.builder().apply(initializer).build()
