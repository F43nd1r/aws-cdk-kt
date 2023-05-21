package com.faendir.awscdkkt.services.vpclattice

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.vpclattice.CfnService
import software.amazon.awscdk.services.vpclattice.CfnServiceProps
import software.constructs.Construct

@Generated
public fun Construct.cfnService(id: String, initializer: CfnService.() -> Unit = {}): CfnService =
    CfnService(this, id).apply(initializer)

@Generated
public fun Construct.cfnService(
  id: String,
  props: CfnServiceProps,
  initializer: CfnService.() -> Unit = {},
): CfnService = CfnService(this, id, props).apply(initializer)
