package com.faendir.awscdkkt.services.config

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.config.CfnStoredQuery
import software.amazon.awscdk.services.config.CfnStoredQueryProps
import software.constructs.Construct

@Generated
public fun Construct.cfnStoredQuery(
  id: String,
  props: CfnStoredQueryProps,
  initializer: CfnStoredQuery.() -> Unit = {},
): CfnStoredQuery = CfnStoredQuery(this, id, props).apply(initializer)
