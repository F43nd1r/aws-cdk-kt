@file:Generated(value = ["Generated 2023-05-20 based on CDK 2.79.1"])

package com.faendir.awscdkkt.services.sagemaker

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.sagemaker.CfnModelPackageGroup
import software.amazon.awscdk.services.sagemaker.CfnModelPackageGroupProps
import software.constructs.Construct

public fun Construct.cfnModelPackageGroup(
  id: String,
  props: CfnModelPackageGroupProps,
  initializer: CfnModelPackageGroup.() -> Unit = {},
): CfnModelPackageGroup = CfnModelPackageGroup(this, id, props).apply(initializer)
