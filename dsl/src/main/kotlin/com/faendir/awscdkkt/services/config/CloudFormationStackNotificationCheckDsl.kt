@file:Generated(value = ["Generated based on CDK v2.79.1"])

package com.faendir.awscdkkt.services.config

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.config.CloudFormationStackNotificationCheck
import software.amazon.awscdk.services.config.CloudFormationStackNotificationCheckProps
import software.constructs.Construct

public fun Construct.cloudFormationStackNotificationCheck(id: String,
    initializer: CloudFormationStackNotificationCheck.() -> Unit = {}):
    CloudFormationStackNotificationCheck = CloudFormationStackNotificationCheck(this,
    id).apply(initializer)

public fun Construct.cloudFormationStackNotificationCheck(
  id: String,
  props: CloudFormationStackNotificationCheckProps,
  initializer: CloudFormationStackNotificationCheck.() -> Unit = {},
): CloudFormationStackNotificationCheck = CloudFormationStackNotificationCheck(this, id,
    props).apply(initializer)
