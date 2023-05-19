@file:Generated(value = ["Generated 2023-05-19 based on CDK 2.79.1"])

package com.faendir.awscdkkt.services.config

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.config.CloudFormationStackDriftDetectionCheck
import software.amazon.awscdk.services.config.CloudFormationStackDriftDetectionCheckProps
import software.constructs.Construct

public fun Construct.cloudFormationStackDriftDetectionCheck(id: String,
    initializer: CloudFormationStackDriftDetectionCheck.() -> Unit = {}):
    CloudFormationStackDriftDetectionCheck = CloudFormationStackDriftDetectionCheck(this,
    id).apply(initializer)

public fun Construct.cloudFormationStackDriftDetectionCheck(
  id: String,
  props: CloudFormationStackDriftDetectionCheckProps,
  initializer: CloudFormationStackDriftDetectionCheck.() -> Unit = {},
): CloudFormationStackDriftDetectionCheck = CloudFormationStackDriftDetectionCheck(this, id,
    props).apply(initializer)
