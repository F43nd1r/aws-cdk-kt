package com.faendir.awscdkkt.generated.services.eks

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.eks.EksOptimizedImage
import software.amazon.awscdk.services.eks.EksOptimizedImageProps

@Generated
public fun eksOptimizedImage(): EksOptimizedImage = EksOptimizedImage()

@Generated
public fun eksOptimizedImage(props: EksOptimizedImageProps): EksOptimizedImage =
    EksOptimizedImage(props)

@Generated
public fun buildEksOptimizedImage(initializer: @AwsCdkDsl EksOptimizedImage.Builder.() -> Unit):
    EksOptimizedImage = EksOptimizedImage.Builder.create().apply(initializer).build()
