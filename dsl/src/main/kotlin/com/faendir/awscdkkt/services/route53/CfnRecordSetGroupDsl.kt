@file:Generated(value = ["Generated based on CDK v2.79.1"])

package com.faendir.awscdkkt.services.route53

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.route53.CfnRecordSetGroup
import software.amazon.awscdk.services.route53.CfnRecordSetGroupProps
import software.constructs.Construct

public fun Construct.cfnRecordSetGroup(
  id: String,
  props: CfnRecordSetGroupProps,
  initializer: CfnRecordSetGroup.() -> Unit = {},
): CfnRecordSetGroup = CfnRecordSetGroup(this, id, props).apply(initializer)

public fun Construct.cfnRecordSetGroup(id: String, initializer: CfnRecordSetGroup.() -> Unit = {}):
    CfnRecordSetGroup = CfnRecordSetGroup(this, id).apply(initializer)
