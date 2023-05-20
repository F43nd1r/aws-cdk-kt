@file:Generated(value = ["Generated based on CDK v2.80.0"])

package com.faendir.awscdkkt.services.waf.regional

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.waf.regional.CfnSqlInjectionMatchSet
import software.amazon.awscdk.services.waf.regional.CfnSqlInjectionMatchSetProps
import software.constructs.Construct

public fun Construct.cfnSqlInjectionMatchSet(
  id: String,
  props: CfnSqlInjectionMatchSetProps,
  initializer: CfnSqlInjectionMatchSet.() -> Unit = {},
): CfnSqlInjectionMatchSet = CfnSqlInjectionMatchSet(this, id, props).apply(initializer)
