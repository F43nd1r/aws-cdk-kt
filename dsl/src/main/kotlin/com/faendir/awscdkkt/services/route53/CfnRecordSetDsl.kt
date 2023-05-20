@file:Generated(value = ["Generated based on CDK v2.80.0"])

package com.faendir.awscdkkt.services.route53

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.route53.CfnRecordSet
import software.amazon.awscdk.services.route53.CfnRecordSetProps
import software.constructs.Construct

public fun Construct.cfnRecordSet(
  id: String,
  props: CfnRecordSetProps,
  initializer: CfnRecordSet.() -> Unit = {},
): CfnRecordSet = CfnRecordSet(this, id, props).apply(initializer)
