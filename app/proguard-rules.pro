-dontoptimize
-dontobfuscate
-dontpreverify
-dontwarn scala.**
-ignorewarnings
# temporary workaround; see Scala issue SI-5397
-keep class scala.collection.SeqLike {
    public protected *;
}
