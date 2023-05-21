package com.faendir.awscdkkt.services.waf.regional

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.waf.regional.CfnXssMatchSet

@Generated
public fun fieldToMatchProperty(initializer: CfnXssMatchSet.FieldToMatchProperty.Builder.() -> Unit
    = {}): CfnXssMatchSet.FieldToMatchProperty =
    CfnXssMatchSet.FieldToMatchProperty.builder().apply(initializer).build()
