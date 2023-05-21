package com.faendir.awscdkkt.services.kms

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.kms.CfnKey
import software.amazon.awscdk.services.kms.CfnKeyProps
import software.constructs.Construct

@Generated
public fun Construct.cfnKey(
  id: String,
  props: CfnKeyProps,
  initializer: CfnKey.() -> Unit = {},
): CfnKey = CfnKey(this, id, props).apply(initializer)
