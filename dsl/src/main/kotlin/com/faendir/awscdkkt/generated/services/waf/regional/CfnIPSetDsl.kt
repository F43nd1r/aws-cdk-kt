package com.faendir.awscdkkt.generated.services.waf.regional

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.waf.regional.CfnIPSet
import software.amazon.awscdk.services.waf.regional.CfnIPSetProps
import software.constructs.Construct

@Generated
public fun Construct.cfnIPSet(
  id: String,
  props: CfnIPSetProps,
  initializer: @AwsCdkDsl CfnIPSet.() -> Unit = {},
): CfnIPSet = CfnIPSet(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnIPSet(id: String, initializer: @AwsCdkDsl CfnIPSet.Builder.() -> Unit = {}): CfnIPSet = CfnIPSet.Builder.create(this, id).apply(initializer).build()
