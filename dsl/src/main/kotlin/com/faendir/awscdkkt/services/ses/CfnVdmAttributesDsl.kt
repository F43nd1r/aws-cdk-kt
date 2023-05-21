package com.faendir.awscdkkt.services.ses

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.ses.CfnVdmAttributes
import software.amazon.awscdk.services.ses.CfnVdmAttributesProps
import software.constructs.Construct

@Generated
public fun Construct.cfnVdmAttributes(id: String, initializer: CfnVdmAttributes.() -> Unit = {}):
    CfnVdmAttributes = CfnVdmAttributes(this, id).apply(initializer)

@Generated
public fun Construct.cfnVdmAttributes(
  id: String,
  props: CfnVdmAttributesProps,
  initializer: CfnVdmAttributes.() -> Unit = {},
): CfnVdmAttributes = CfnVdmAttributes(this, id, props).apply(initializer)
