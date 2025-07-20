package com.faendir.awscdkkt.generated.services.waf.regional

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.waf.regional.CfnGeoMatchSet
import software.amazon.awscdk.services.waf.regional.CfnGeoMatchSetProps
import software.constructs.Construct

@Generated
public fun Construct.cfnGeoMatchSet(
  id: String,
  props: CfnGeoMatchSetProps,
  initializer: @AwsCdkDsl CfnGeoMatchSet.() -> Unit = {},
): CfnGeoMatchSet = CfnGeoMatchSet(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnGeoMatchSet(id: String, initializer: @AwsCdkDsl CfnGeoMatchSet.Builder.() -> Unit = {}): CfnGeoMatchSet = CfnGeoMatchSet.Builder.create(this, id).apply(initializer).build()
