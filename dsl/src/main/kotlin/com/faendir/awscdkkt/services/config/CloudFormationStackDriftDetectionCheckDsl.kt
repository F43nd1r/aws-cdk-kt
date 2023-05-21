package com.faendir.awscdkkt.services.config

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.config.CloudFormationStackDriftDetectionCheck
import software.amazon.awscdk.services.config.CloudFormationStackDriftDetectionCheckProps
import software.constructs.Construct

@Generated
public fun Construct.cloudFormationStackDriftDetectionCheck(id: String,
    initializer: CloudFormationStackDriftDetectionCheck.() -> Unit = {}):
    CloudFormationStackDriftDetectionCheck = CloudFormationStackDriftDetectionCheck(this,
    id).apply(initializer)

@Generated
public fun Construct.cloudFormationStackDriftDetectionCheck(
  id: String,
  props: CloudFormationStackDriftDetectionCheckProps,
  initializer: CloudFormationStackDriftDetectionCheck.() -> Unit = {},
): CloudFormationStackDriftDetectionCheck = CloudFormationStackDriftDetectionCheck(this, id,
    props).apply(initializer)
