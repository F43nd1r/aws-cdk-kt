@file:Generated(value = ["Generated 2023-05-19 based on CDK 2.79.1"])

package com.faendir.awscdkkt.services.ses

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.ses.CfnVdmAttributes
import software.amazon.awscdk.services.ses.CfnVdmAttributesProps
import software.constructs.Construct

public fun Construct.cfnVdmAttributes(id: String, initializer: CfnVdmAttributes.() -> Unit = {}):
    CfnVdmAttributes = CfnVdmAttributes(this, id).apply(initializer)

public fun Construct.cfnVdmAttributes(
  id: String,
  props: CfnVdmAttributesProps,
  initializer: CfnVdmAttributes.() -> Unit = {},
): CfnVdmAttributes = CfnVdmAttributes(this, id, props).apply(initializer)
