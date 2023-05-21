package com.faendir.awscdkkt.services.athena

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.athena.CfnNamedQuery
import software.amazon.awscdk.services.athena.CfnNamedQueryProps
import software.constructs.Construct

@Generated
public fun Construct.cfnNamedQuery(
  id: String,
  props: CfnNamedQueryProps,
  initializer: CfnNamedQuery.() -> Unit = {},
): CfnNamedQuery = CfnNamedQuery(this, id, props).apply(initializer)
