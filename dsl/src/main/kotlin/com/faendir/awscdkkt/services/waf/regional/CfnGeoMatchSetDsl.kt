package com.faendir.awscdkkt.services.waf.regional

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
  initializer: CfnGeoMatchSet.() -> Unit = {},
): CfnGeoMatchSet = CfnGeoMatchSet(this, id, props).apply(initializer)
