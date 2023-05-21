package com.faendir.awscdkkt.services.codebuild

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.codebuild.BitBucketSourceCredentials
import software.amazon.awscdk.services.codebuild.BitBucketSourceCredentialsProps
import software.constructs.Construct

@Generated
public fun Construct.bitBucketSourceCredentials(
  id: String,
  props: BitBucketSourceCredentialsProps,
  initializer: BitBucketSourceCredentials.() -> Unit = {},
): BitBucketSourceCredentials = BitBucketSourceCredentials(this, id, props).apply(initializer)
