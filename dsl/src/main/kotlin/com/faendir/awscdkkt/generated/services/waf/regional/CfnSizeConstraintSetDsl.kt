package com.faendir.awscdkkt.generated.services.waf.regional

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.waf.regional.CfnSizeConstraintSet
import software.amazon.awscdk.services.waf.regional.CfnSizeConstraintSetProps
import software.constructs.Construct

@Generated
public fun Construct.cfnSizeConstraintSet(
  id: String,
  props: CfnSizeConstraintSetProps,
  initializer: @AwsCdkDsl CfnSizeConstraintSet.() -> Unit = {},
): CfnSizeConstraintSet = CfnSizeConstraintSet(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnSizeConstraintSet(id: String, initializer: @AwsCdkDsl
    CfnSizeConstraintSet.Builder.() -> Unit = {}): CfnSizeConstraintSet =
    CfnSizeConstraintSet.Builder.create(this, id).apply(initializer).build()
