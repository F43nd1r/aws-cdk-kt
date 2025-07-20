package com.faendir.awscdkkt.generated.services.codebuild

import com.faendir.awscdkkt.AwsCdkDsl
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
  initializer: @AwsCdkDsl BitBucketSourceCredentials.() -> Unit = {},
): BitBucketSourceCredentials = BitBucketSourceCredentials(this, id, props).apply(initializer)

@Generated
public fun Construct.buildBitBucketSourceCredentials(id: String, initializer: @AwsCdkDsl BitBucketSourceCredentials.Builder.() -> Unit = {}): BitBucketSourceCredentials = BitBucketSourceCredentials.Builder.create(this, id).apply(initializer).build()
