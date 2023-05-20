@file:Generated(value = ["Generated based on CDK v2.79.1"])

package com.faendir.awscdkkt.services.config

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.config.CfnStoredQuery
import software.amazon.awscdk.services.config.CfnStoredQueryProps
import software.constructs.Construct

public fun Construct.cfnStoredQuery(
  id: String,
  props: CfnStoredQueryProps,
  initializer: CfnStoredQuery.() -> Unit = {},
): CfnStoredQuery = CfnStoredQuery(this, id, props).apply(initializer)
