package com.faendir.awscdkkt.services.waf

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.waf.CfnSizeConstraintSet

@Generated
public
    fun sizeConstraintProperty(initializer: CfnSizeConstraintSet.SizeConstraintProperty.Builder.() -> Unit
    = {}): CfnSizeConstraintSet.SizeConstraintProperty =
    CfnSizeConstraintSet.SizeConstraintProperty.builder().apply(initializer).build()
