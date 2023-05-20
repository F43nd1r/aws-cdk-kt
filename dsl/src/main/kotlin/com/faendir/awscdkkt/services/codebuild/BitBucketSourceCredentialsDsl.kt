@file:Generated(value = ["Generated 2023-05-20 based on CDK 2.79.1"])

package com.faendir.awscdkkt.services.codebuild

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.codebuild.BitBucketSourceCredentials
import software.amazon.awscdk.services.codebuild.BitBucketSourceCredentialsProps
import software.constructs.Construct

public fun Construct.bitBucketSourceCredentials(
  id: String,
  props: BitBucketSourceCredentialsProps,
  initializer: BitBucketSourceCredentials.() -> Unit = {},
): BitBucketSourceCredentials = BitBucketSourceCredentials(this, id, props).apply(initializer)
