package com.faendir.awscdkkt.services.config

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.config.CloudFormationStackNotificationCheck
import software.amazon.awscdk.services.config.CloudFormationStackNotificationCheckProps
import software.constructs.Construct

@Generated
public fun Construct.cloudFormationStackNotificationCheck(id: String,
    initializer: CloudFormationStackNotificationCheck.() -> Unit = {}):
    CloudFormationStackNotificationCheck = CloudFormationStackNotificationCheck(this,
    id).apply(initializer)

@Generated
public fun Construct.cloudFormationStackNotificationCheck(
  id: String,
  props: CloudFormationStackNotificationCheckProps,
  initializer: CloudFormationStackNotificationCheck.() -> Unit = {},
): CloudFormationStackNotificationCheck = CloudFormationStackNotificationCheck(this, id,
    props).apply(initializer)
